package com.example.smarthealth.ui.information;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthealth.R;




public class InformationFragment extends Fragment {

    RecyclerVierAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {





        View root = inflater.inflate(R.layout.fragment_information, container, false);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerVierAdapter();
        recyclerView.setAdapter(adapter);
        getData();
        return root;


    }


    public void getData(){

        DataQnA data = new DataQnA("FAQ", "");
        adapter.addItem(data);

        data = new DataQnA("Q1. 꿈을 많이 꾸면 수면 장애인가요?", " 꿈을 많이 꾸는 현상은 수면장애와 무관하지 않아요. 꿈은 전체 수면의 약 20%를 차지하는 렘수면 단계에서 꾸게 되는데, 렘수면 상태에서 잠이 깰 경우, 꿈을 꾼 사실을 자각하게 돼요. 반면 깊게 자고 일어나면 꿈을 꾼 사실을 기억하지 못합니다. 수면장애가 있는 사람일수록 밤에 자주 깨기 때문에 꿈을 더 잘 기억하게 되는 거예요.");
        adapter.addItem(data);
        data = new DataQnA("Q2. 요새 잠을 많이 설쳤어요. 저도 불면증인가요?", " 불면증은 잠들기가 어렵거나, 자주 깨거나 깬 다음 다시 잠들기 어렵거나, 새벽에 일찍 깨어 다시 잠들기 어려운 증상 중 한 가지 이상을 보이고, 주 3회, 3개월 이상 나타나요. 또한, \n" +
                "이러한 증상들이 부적절한 수면 환경, 물질에 의한 수면장애나 다른 정신장애, 의학적 상태로 설명되지 않을 때 불면증이라고 해요.");
        adapter.addItem(data);
        data = new DataQnA("Q3. 저는 술을 마시면 잠이 잘 오는데, 술이 수면을 돕는 건가요?", " 알코올은 잠에 드는 것을 도울 수는 있지만, 수면을 유지 하는 것을 방해하기 때문에 잠에서 자주 깨게 만들어 오히려 수면 장애를 유발할 수 있어요. 따라서 수면 건강을 위해서 음주를 자제하는 것이 좋아요.");
        adapter.addItem(data);
        data = new DataQnA("Q4. 잠을 자도 자도 피곤해요. 제가 이상한건가요?", "개인에게 필요한 수면시간은 사람마다 다르고 나이에 따라서 변하기도 한다. 평균적으로 성인에게 필요한 수면시간은 7-8시간이며, 전체 인구의 약 1-2%의 사람은 하루 10시간 이상 잠을 자야 일상생활에 지장이 없는 long sleeper이며, 또 다른 1-2%는 하루 4시간 이내로 자도 충분한 short sleeper 이다. 따라서 사람마다 필요한 수면시간이 다르다. ");
        adapter.addItem(data);
        data = new DataQnA("Q5. 잠을 몰아서 자도 괜찮을까요?", "평소에 수면시간이 부족하게 되면 수면 빚이 쌓이게 된다. 이를 해결하지 못하면 정신기능과 심혈관계를 비롯한 신체기능에 악영향을 미치게 될 뿐만 아니라, 불면증, 주간졸음증, 수면주기 이상, 만성피로증후군 등을 초래할 수 있다. ");
        adapter.addItem(data);
        data = new DataQnA("Q6. 낮잠을 잔다면 얼마나 자는 것이 좋을까요?", "밤잠에 영향을 주는 낮잠 시간은 오후 4시 이후로, 그 전의 낮잠은 밤잠에 큰 영향을 끼치지 않아요. 낮잠은 보통 15-30분 사이가 적당하며, 선잠 단계에서의 낮잠은 졸음을 없앨 수 있고 깨어난 후에도 집중력을 높이게 해요. 또한 짧은 낮잠은 몸의 활기를 찾을 수 있고 다시 시작할 수 있는 에너지를 만들어 내요.");
        adapter.addItem(data);

        data = new DataQnA("수면을 위한 십계명", "");
        adapter.addItem(data);
        data = new DataQnA("1. 휴일에 늦잠을 자지 마세요.\n", " 휴일 전날 마음먹고 늦게까지 시간을 보내고 늦잠을 잔다면, 한 주 내내 뒤바뀐 수면 패턴으로 고생할 수 있어요. 늦잠을 실컷 잔 후 아침 겸 점심 식사를 한다면 휴일 저녁 불면증을 겪고 이후 일주일은 뒤바뀐 수면 패턴으로 생체리듬이 망가질 수 있어요. 수면습관은 쉽게 바뀔 수 있고 스트레스가 있는 주중에는 더욱 예민해질 수 있으니 여유가 있는 휴일은 평소와 같은 시간의 일정을 유지하고, 꼭 수면이 필요하다면 짧은 낮잠을 즐기는 것이 좋아요.");
        adapter.addItem(data);
        data = new DataQnA("2. 잠자리에 들기 전에 먹고 마시는 것을 삼가세요.\n", " 수면 중엔 위장도 쉬어야 해요. 음식물 섭취는 위장에 많은 부담을 줄 뿐만 아니라 자율신경계와 심장 또한 쉬지 못하게 해 편안한 수면을 방해해요. 특히 자극적인 음식은 더욱 심한 장애를 유발할 수 있으므로 잠들기 전 2시간은 먹고 마시는 일을 삼가 하는 것이 좋아요. 알코올은 수면을 편안하게 할 수도 있으나 과할 경우 오히려 수면을 유지하는 데 방해가 되고 아침 일찍 깨어나게 하므로 피해야 해요.");
        adapter.addItem(data);
        data = new DataQnA("3. 카페인과 니코틴을 피하세요.\n", " 카페인과 니코틴은 뇌를 자극해 각성 상태를 유지하게 해 수면에 좋지 않아요. 카페인에 예민한 사람이라면 점심시간 이후에는 섭취를 피해야 해요. 카페인 섭취와 상관없이 수면을 취한다고 표현하는 사람들도 예외는 아닙니다. 수면을 취하고 있어도 카페인 성분에 영향을 받아 뇌는 깨어있기 때문이죠. 또한, 취침 전의 흡연은 뇌의 각성은 물론 금단 증상으로 새벽녘에 잠을 깰 수 있고 호흡기 계통에 자극을 줘 숙면을 보장할 수 없습니다.");
        adapter.addItem(data);
        data = new DataQnA("4. 가능하면 운동을 매일 규칙적으로 하고, 낮 시간에 밝은 태양아래서 실시하세요.\n", " 뇌 속 생체시계는 태양의 빛에 따라 움직입니다. 낮 시간에 밝은 태양 아래 운동을 하게 되면 생체시계에 필요한 자극을 줄 뿐 아니라 육체적 운동으로 긴장을 풀고 야간 수면을 유도 하는 데 도움이 돼요. 운동은 수면시간 6시간 전에 끝내는 것이 좋고, 저녁 시간대에는 자기 전까지 실내조명을 밝게 유지 하는 것도 도움이 됩니다.");
        adapter.addItem(data);
        data = new DataQnA("5. 실내는 선선하게 유지하고 손발은 따뜻하게\n", " 수면 중에는 실내 기온을 약간 낮게 유지 하는 것이 좋아요. 수면 중의 인체는 활동시기보다 체온이 떨어지기 때문에 기온을 약간 낮게 유지하면 인체는 편안함을 느끼게 돼요. 인간은 정온 동물이고 추위를 방어하기 좋은 신체 구조를 가지고 있어요. 고온에서는 일정한 체온을 유지하기 위해 더 많은 에너지를 필요로 하기 때문에 편안함을 느낄 수 없게 돼요. 따라서 실내온도는 낮게 유지하는 것이 좋고, 손·발과 같이 추위를 쉽게 느끼는 부위는 이불을 이용하여 체온을 유지하는 것이 좋습니다.");
        adapter.addItem(data);
        data = new DataQnA("6. 낮잠은 짧게 \n", " 낮잠은 밤잠을 빼앗아 가요. 몸이 피곤하거나, 날씨에 영향을 받아 졸음을 참기 힘들면 20분 이내의 짧은 낮잠을 즐기는 것이 좋아요. 긴 낮잠은 두통을 유발할 수 있고, 수면의 깊은 단계까지 들어가게 되면 잠에서 깨기 어렵고 육체적으로 피곤을 느끼게 됩니다.");
        adapter.addItem(data);
        data = new DataQnA("7. TV 등 자극 요인 제거하기\n", " TV나 라디오, 스마트폰 등 소음은 우리들의 청각(TV, 스마트폰은 시각도 함께 자극)을 자극하게 되고 우리의 뇌를 깨우기 때문에 수면을 방해하게 됩니다. 수면 전에 뇌를 자극하는 요인들을 제거해 뇌를 쉬게 해야 돼요.");
        adapter.addItem(data);
        data = new DataQnA("8. 잠자리는 맞춤형으로\n", " 잠자리는 자신이 가장 편안한 자세를 취할 수 있도록 만들어야 해요. 아무리 값비싼 침실일지라도 자신에게 편안하지 않다면 수면에 방해가 될 뿐입니다. 여행 등으로 잠자리가 바뀌는 경우, 아무리 피곤해도 숙면을 취하지 못하고 쉽게 깨어나는 것은 자신에게 맞지 않기 때문이에요. 잠자리는 자신에게 가장 편안하고 알맞은 형태로 본인이 직접 만드는 것이 좋아요.");
        adapter.addItem(data);
        data = new DataQnA("9. 수면 전에는 긴장 풀기\n", " 긴장을 하게 되면 인체는 신경계, 근육 등 모든 것이 초비상 상태가 됩니다. 이러한 상태에서 편안히 숙면을 취하는 것은 불가능해요. 스트레스나 고민거리가 생긴 경우 가능하면 없애버리고, 긴장을 풀기 어렵다면 따뜻한 물로 샤워를 하거나 가벼운 스트레칭 체조를 하면 큰 도움이 돼요.");
        adapter.addItem(data);
        data = new DataQnA("10. 많은 잠보다 충분한 잠을\n", "도저히 잠이 오지 않을 때는 최소량의 수면제를 사용하고, 잠이 필요하지 않을 정도로 컨디션이 유지되고 있다면 억지로 잠을 청하지 않는 것이 좋아요. 수면량은 개인마다 차이가 있고, 그날의 컨디션에 따라 다를 수 있으므로 자신의 컨디션에 알맞은 충분한 수면을 취하는 것이 좋아요.");
        adapter.addItem(data);


        data = new DataQnA("", "");
        adapter.addItem(data);

    }

}

